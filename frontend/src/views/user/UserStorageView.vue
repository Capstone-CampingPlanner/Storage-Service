<template>
  <p>사용자 보관함 보기</p>
  <label for="member">사용자 아이디</label>
  <input id="member" type="text" v-model="memberId">
  <button @click="inputMember">입력</button>
  사용자 이름:{{memberId}}
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

      <router-link :to="{name:'userStorageDetail', params:{storageCode:boxList[0].storageCode.storageCode, memberId:memberId}}"><button>신청</button></router-link>
      <p @click="closeDetail">X</p>
      <div class="storage-view">

          <div class="storage-box" v-for="(box,index) in boxList" :key="index">


            <ul>
              <li>보관함 이름: {{ box.storageBoxName }}</li>
              <li>보관함 상태:<p v-if="box.storageBoxState == '0'">사용가능</p>
                <p v-else-if="box.storageBoxState == '1' ">사용불가능</p>

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
  name: "UserStorageView",
  components: {},
  created() {
    axios.get('/api/getStorage')
        .then((res) => {
          console.log(res)
          console.log(res.data)
          this.storageList = res.data

          console.log('ALL this.storageList')
          console.log(this.storageList)
        })
        .catch((error) => {
          console.log(error)
        })
  },
  data() {
    return {
      storageList: [],
      check: false,
      boxList: [],
      name: '',
      memberId:''
    }
  },
  methods: {
    inputMember() {
      axios.get('/api/memberCheck/'+this.memberId)
      .then(res=>{
        console.log(res)
        if(res.data.result=='ok'){
          console.log('확인')

        }else {
          console.log("안돼")
        }
      })
    },
    GetStorageDetail(storageCode) {
      this.detailCheck()
      axios.get('/api/storageView/' + storageCode)
          .then((resp) => {
            console.log(resp.data)
            this.boxList = resp.data
            let storageName = this.boxList[0].storageCode.storageName
            this.name = storageName

          })
          .catch((err) => {
            console.log(err)
          })
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