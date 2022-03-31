<template>
  <div>
    <input type="text" v-model="form.storageName" placeholder="보관소명">
    <input type="text" v-model="form.storageZipcode" placeholder="우편번호">
    <input type="text" v-model="form.storageAddress" placeholder="주소">
    <button @click="postStorage()">ADD</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "StorageAdd",
  data(){
    return{
      form:{
        storageName:'',
        storageZipcode:'',
        storageAddress:''
      },
      errorCheck:false
    }
  },
  methods:{
    inputCheck(){
      if(!this.form.storageName){
        alert('보관소 명을 입력하세요')
      }else if(!this.form.storageZipcode){
        alert('보관소 우편주소을 입력하세요')
      }else if(!this.form.storageAddress){
        alert('보관소 주소을 입력하세요')
      }else{
        this.errorCheck = true
      }
    },
    clearInput(){
      this.form.storageName = ''
      this.form.storageZipcode = ''
      this.form.storageAddress = ''
    },
    postStorage(){
      this.inputCheck()
      if(this.errorCheck){
        axios.post('api/postStorage', this.form)
            .then((res)=>{
              console.log(this.form)
              console.log(res.data.result)
              if(res.data.result === 'ok'){
                console.log('중복없음')
                this.clearInput()
              }
              else{
                console.log('중복')
              }
            }).catch((err)=>{
          console.log(err)
        })
      }
    }
  }
}
</script>

<style scoped>

</style>