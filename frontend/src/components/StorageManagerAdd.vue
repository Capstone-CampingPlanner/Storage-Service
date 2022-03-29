<template>
  <div class="manager-add">
    <input type="text" v-model="memberId" placeholder="매니저아이디">
    <button @click="CheckMember()">CHECK</button>


    <input type="text" v-model="storageName" placeholder="보관소명">
    <button @click="postManager()">ADD</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "StorageManagerAdd",
  data() {
    return {
      memberId: '',
      storageName: '',
      errorCheck: false
    }
  },
  methods: {
    inputCheck() {
      if (!this.memberId) {
        alert('매니저를 입력하세요')
      } else if (!this.storageName) {
        alert('보관소 입력하세요')
      } else {
        this.errorCheck = true
      }
    },
    clearInput() {
      this.memberId = ''
      this.storageName = ''
    },
    CheckMember(){
      let rew ={};
      if(!this.memberId){
        alert('아이디를 입력하세요')
      }else{
        axios.post('api/checkManager',{memberId : this.memberId})
        .then((res)=>{
          console.log(res)
          rew = res.data
          console.log(rew.result)
          if(rew.result =='ok') {
            console.log('가능')
            alert('가능합니다')
          }else if(rew.result == 'overlap'){
            console.log('불가능')
            alert('불가능합니단')
          }
        })
        .catch((error)=>{
          console.log(error)
        })
      }
    },
    postManager() {
      this.inputCheck()
      if (this.errorCheck) {
        axios.post('api/postManager',
            {
              memberId: this.memberId,
              storageName: this.storageName
              }
            )
            .then((res) => {
              console.log(this.form)
              if (res === 'ok') {
                console.log('중복없음')
              } else {
                console.log('중복')
              }
            }).catch((err) => {
          console.log(err)
        })
        this.clearInput()
      }
    }
  }
}
</script>

<style scoped>

</style>