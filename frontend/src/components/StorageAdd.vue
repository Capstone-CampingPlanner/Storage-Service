<template>
  <div>
    <input type="text" v-model="form.storage_name" placeholder="보관소명">
    <input type="text" v-model="form.storage_zipcode" placeholder="우편번호">
    <input type="text" v-model="form.storage_address" placeholder="주소">
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
        storage_name:'',
        storage_zipcode:'',
        storage_address:''
      },
      errorCheck:false
    }
  },
  methods:{
    inputCheck(){
      if(!this.form.storage_name){
        alert('보관소 명을 입력하세요')
      }else if(!this.form.storage_zipcode){
        alert('보관소 우편주소을 입력하세요')
      }else if(!this.form.storage_address){
        alert('보관소 주소을 입력하세요')
      }else{
        this.errorCheck = true
      }
    },
    clearInput(){
      this.storage_name = ''
      this.storage_zipcode = ''
      this.storage_address = ''
    },

    postStorage(){
      this.inputCheck()
      if(this.errorCheck){
        axios.post('api/postStorage', this.form)
            .then((res)=>{
              console.log(this.form)
              if(res === 'ok'){
                console.log('중복없음')
              }
              else{
                console.log('중복')
              }
            }).catch((err)=>{
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