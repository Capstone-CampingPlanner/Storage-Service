<template>
  <div class="storage">
    보관소 이름:{{ name }}

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
    <div>
      사용할 보관함 입력 받고 결제
      사용하실 보관함을 선택하세요
      <select v-model="boxCode">
        <option>선택</option>
        <option :value="box.storageBoxCode" v-for="(box,index) in boxList" :key="index">{{ box.storageBoxName }}</option>
      </select>
    </div>
    <div>
      대여기간 설정
      <Datepicker
          locale="ko-KR"
          type="date"
          format="yyyy/MM/dd"
          value-format="yyyyMMdd"
          :enableTimePicker="false"
          autoApply
          :closeOnAutoApply="false"
          placeholder="Select Date"
          v-model="date"
          range auto-range="29"
          :disabledDates="disabledDates" />
      {{this.date}}
    </div>
    <div>
      결제방법 카드
      어쩌고 저쩌고
      <button @click="pay">결제</button>
    </div>
  </div>

</template>

<script>
import axios from "axios";

import Datepicker  from '@vuepic/vue-datepicker';
import '@vuepic/vue-datepicker/dist/main.css';

export default {
  //eslint-disable-next-line
  name: "StorageDetail",
  components:{
    Datepicker
  },
  mounted() {
    axios.get('/api/storageView/' + this.id)
        .then((resp) => {
          console.log(resp.data)
          this.boxList = resp.data
          let storageName = this.boxList.storageCode.storageName
          this.name = storageName

        })
        .catch((err) => {
          console.log(err)
        })
  },
  created() {

    this.id = this.$route.params.storageCode
    this.userId = this.$route.params.memberId
    console.log(this.userId)
  },
  data() {
    return {
      id: '',
      boxList: [],
      name: '',
      date:null,
      userId:'',
      boxCode:'',
      form:{
        userId:'',
        storageBoxCode:''

      }
    }
  },
  methods:{
    pay(){
      console.log(this.boxCode)
      console.log(this.userId)
      this.form.storageBoxCode = this.boxCode
      this.form.userId = this.userId

      axios.post('/api/payStorageBox', this.form )
      .then(res=>{
        console.log(res)
      })
      .catch(err=>{
        console.log(err)
      })
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