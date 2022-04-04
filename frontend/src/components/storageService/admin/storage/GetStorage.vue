<template>
  <p>보관소 리스트 페이지</p>
  <div class="storage-get">
    <div v-for="(storage,index) in storageList" :key="index" @click="GetStorageDetail(storage.storageCode)">
      <div>
        이름:{{ storage.storageName }}
        주소:{{ storage.storageAddress }}
      </div>
    </div>
  </div>
  <div v-if="check">
    <div class="storage">
      보관소 이름:{{ name }}
      <p @click="closeDetail">X</p>
      <div>
        보관소 매니저
        <p>추가</p>
        <div class="manager-add">
          <input type="text" v-model="memberId" placeholder="매니저아이디">
          <button @click="CheckMember()">CHECK</button>
          <p v-if="memberIdCheck">가능</p>
          <button v-if="memberIdCheck" @click="postManager">ADD</button>
        </div>
        <table>
          <thead>
          <tr>
            <td>이름</td>
            <td>아이디</td>
            <td>직급</td>
          </tr>
          </thead>
          <tbody v-for="(manager, index) in managerList" :key="index">
          <tr>
            <td>{{ manager.memberCode.memberName }}</td>
            <td>{{ manager.memberCode.memberId }}</td>
            <td>매니저</td>
          </tr>
          </tbody>
        </table>
      </div>

      <div class="storage-view">

        <div class="storage-box" v-for="(box,index) in boxList" :key="index">

          <ul>
            <li>보관함 이름: {{ box.storageBoxName }}</li>
            <li>보관함 상태:<p v-if="box.storageBoxState == '0'">사용안함</p>
              <p v-else-if="box.storageBoxState == '1' ">사용중</p>

            </li>

          </ul>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
import axios from "axios";

export default {
  name: "GetStorage",
  components: {},
  mounted() {
    this.GetStorage()
  },
  data() {
    return {
      storageList: [],
      check: false,
      boxList: [],
      name: '',
      managerList: [],
      memberId: '',
      errorCheck: false,
      memberIdCheck: false
    }
  },
  methods: {
    GetStorage() {
      axios.get('/api/getStorage')
          .then((res) => {
            this.storageList = res.data
          })
          .catch((error) => {
            console.log(error)
          })
    },
    GetStorageDetail(storageCode) {
      this.detailCheck()
      axios.get('/api/storageView/' + storageCode)
          .then((resp) => {
            this.boxList = resp.data
            let storageName = this.boxList[0].storageCode.storageName
            this.name = storageName
            this.GetManger(storageCode)
            this.memberIdCheck = false
          })
          .catch((err) => {
            console.log(err)
          })
    },
    GetManger(storageCode) {
      axios.get('/api/getManager/' + storageCode)
          .then((res) => {
            console.log(res.data)
            this.managerList = res.data
          })
          .catch((err) => {
            console.log(err)
          })
    },
    clearInput() {
      this.memberId = ''
    },
    CheckMember() {
      if (!this.memberId) {
        alert('아이디를 입력하세요')
      } else {
        axios.get('api/checkManager/' + this.memberId)
            .then((res) => {
              console.log(res)
              if (res.data.result == 'ok') {
                console.log('가능')
                alert('가능합니다')
                this.memberIdCheck = true

              } else if (res.data.result == 'overlap') {
                console.log('불가능')
                alert('이미 있습니다')
                this.memberIdCheck = false
              } else{
                console.log('없음')
                alert('입력하신 아이디가 없습니다')
                this.memberIdCheck = false
              }
            })
            .catch((error) => {
              console.log(error)
            })
      }
    },
    postManager() {
      let memberId = this.memberId
      let storageCode = this.boxList[0].storageCode.storageCode
      let manager ={
        member : memberId,
        storage : storageCode
      }
      if (this.memberIdCheck) {
        axios.post('api/postManager', manager)
            .then((res) => {
              console.log(res.data.result)
              if (res.data.result === 'ok') {
                console.log('생성')
                this.GetManger(storageCode)
                this.clearInput()
              } else {
                alert('추가 되지 않음')
              }
            }).catch((err) => {
          console.log(err)
        })
      }
    },
    detailCheck() {
      if (!this.check) {
        this.check = !this.check
      }
    },
    closeDetail() {
      if (this.check) {
        this.check = !this.check
      }
    }
  }
}

</script>

<style scoped>
.storage-box {
  border: solid 3px #DAA520;
  border-radius: 10px;
  width: 200px;

}

.storage-view {
  border: solid 1px #2c3e50;
  display: -webkit-flex;
  display: flex;
}

.storage {
  border: solid 3px #42b983;
}
</style>