<template>
  <div class="storage-add">
    <input type="text" v-model="form.storageName" placeholder="보관소명">
    <input type="text" v-model="form.storageZipcode" placeholder="우편번호">
    <input type="text" v-model="form.storageAddress" placeholder="주소">
    <button @click="postStorage()">ADD</button>
  </div>
  <div class="storage-box">
    <p>보관함 추가</p>
    <p>{{name}}</p>
    <div class="storage-box-add">
      <table>
        <tbody>
        <tr>
          <td>small</td>
          <td>medium</td>
          <td>large</td>
          <td rowspan="2"><button @click="postBox">ADD</button></td>
        </tr>
        <tr>
          <td><button @click="subS">-</button>{{box.small}}<button @click="addS">+</button></td>
          <td><button @click="subM">-</button>{{box.medium}}<button @click="addM">+</button></td>
          <td><button @click="subL">-</button>{{box.large}}<button @click="addL">+</button></td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "StorageAdd",
  data() {
    return {
      box: {
        small: 0,
        medium: 0,
        large: 0,
        storageName: ''
      },
      form: {
        storageName: '',
        storageZipcode: '',
        storageAddress: ''
      },
      name:'',
      errorCheck: false,
      addStorage: false
    }
  },
  methods: {
    subS(){
      if(this.box.small == 0){
        alert('더이상 내릴 수 없습니다')
        this.box.small = 0
      }else{
        this.box.small--
      }
    },
    subM(){
      if(this.box.medium == 0){
        alert('더이상 내릴 수 없습니다')
        this.box.medium =0
      }else{
        this.box.medium--
      }
    },
    subL(){
      if(this.box.large == 0){
        alert('더이상 내릴 수 없습니다')
        this.box.large =0
      }else{
        this.box.large--
      }

    },
    addS(){
      this.box.small++
    },
    addM(){
      this.box.medium++
    },
    addL(){
      this.box.large++
    },
    inputCheck() {
      if (!this.form.storageName) {
        alert('보관소 명을 입력하세요')
      } else if (!this.form.storageZipcode) {
        alert('보관소 우편주소을 입력하세요')
      } else if (!this.form.storageAddress) {
        alert('보관소 주소을 입력하세요')
      } else {
        this.errorCheck = true
      }
    },
    clearInput() {
      this.form.storageName = ''
      this.form.storageZipcode = ''
      this.form.storageAddress = ''
    },
    claerBox(){
      this.box.small=0
      this.box.medium=0
      this.box.large=0
      this.box.storageName=''
    },
    postStorage() {
      this.inputCheck()
      if (this.errorCheck) {
        axios.post('api/postStorage', this.form)
            .then((res) => {
              console.log(this.form)
              console.log(res.data.result)
              if (res.data.result === 'ok') {
                alert('추가되었습니다')
                console.log('중복없음')
                this.box.storageName = this.form.storageName
                this.name = this.form.storageName
                this.clearInput()
                this.addStorage = true

              } else {
                console.log('중복')
              }
            }).catch((err) => {
          console.log(err)
        })
      }
    },
    postBox(){
      if(!this.addStorage) {
        alert('보관소를 먼저 추가하세요')
      }else if(this.box.small == 0 &&
               this.box.medium == 0 &&
               this.box.large == 0){
        alert('보관소를 추가하세요')
      }else {
        console.log(this.box)
        axios.post('api/postBox',this.box)
        .then((res)=>{
          console.log(res.data.result)
          this.claerBox()
          this.addStorage = false
          this.name=''
        })
        .catch(error=>{
          console.log(error)
        })
      }
    }
  }
}
</script>

<style scoped>
div.storage-box{
  border: solid 3px #DAA520;
}
</style>