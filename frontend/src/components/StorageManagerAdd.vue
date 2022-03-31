<template>
  <div class="manager-add">
    <input type="text" v-model="memberId" placeholder="매니저아이디">
    <button @click="CheckMember()">CHECK</button>
    <p v-if="memberIdCheck">가능</p>


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
      errorCheck: false,
      memberIdCheck : false
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
      if(!this.memberId){
        alert('아이디를 입력하세요')
      }else{
        axios.post('api/checkManager',{memberId : this.memberId})
        .then((res)=>{
          console.log(res)
          if(res.data.result =='ok') {
            console.log('가능')
            alert('가능합니다')
            this.memberIdCheck = true
          }else if(res.data.result == 'overlap'){
            console.log('불가능')
            alert('이미 있습니다')
            this.memberIdCheck = false
          }
        })
        .catch((error)=>{
          console.log(error)
        })
      }
    },
    CheckStorage(){
      if(!this.storageName){
        alert('보관소명을 입력하세요')
      }else{
        axios.post()
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