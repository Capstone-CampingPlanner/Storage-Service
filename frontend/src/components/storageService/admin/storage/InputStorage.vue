<template>
  <div class="storage-add">
    <input type="text" v-model="form.storageName" placeholder="보관소명">
    <input type="text" v-model="form.storageZipcode" placeholder="우편번호">
    <input type="text" v-model="form.storageAddress" placeholder="주소">
    <button @click="postStorage()">ADD</button>
  </div>
  <div class="storage-box">
    <p>보관함 추가</p>
    <div class="storage-box-add">
      <table>
        <tbody>
        <tr>
          <td>small</td>
          <td>medium</td>
          <td>large</td>
          <td rowspan="2"><button @click="inputBox">ADD</button></td>
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
      errorCheck: false,
      addStorage: false,
      boxStorageName:''
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
      this.box.small=''
      this.box.medium=''
      this.box.large=''
      this.box.storageName=''
    },
    postStorage() {
      this.inputCheck()
      if (this.errorCheck) {
        axios.post('/api/postStorage', this.form)
            .then((res) => {
              console.log(this.form)
              console.log(res.data.result)
              if (res.data.result === 'ok') {
                alert('추가되었습니다')
                console.log('중복없음')
                this.boxStorageName = this.form.storageName
                console.log(this.boxStorageName)
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
    inputBox(){
      if(!this.addStorage) {
        alert('보관소를 먼저 추가하세요')
      }else{
        console.log(this.boxStorageName)
        this.box.storageName = this.boxStorageName
        axios.post('/api/postBox',this.box)
        .then((res)=>{
          console.log(res.data.result)
          this.boxStorageName =''
          this.claerBox()
          this.addStorage = false
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