<!-- 현재 사용 안함-->
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
  </div>


</template>

<script>
import axios from "axios";

export default {
  name: "StorageDetail",
  mounted() {

    this.GetStorageDetail()
  },
  created() {

    this.id = this.$route.params.storageCode
    console.log('id:' + this.id)

  },
  data() {
    return {
      id: '',
      boxList: [],
      name: ''
    }
  },
  methods: {
    GetStorageDetail() {
      axios.get('/api/storageView/' + this.id)
          .then((resp) => {
            console.log(resp.data)
            this.boxList = resp.data
            let storageName = this.boxList[0].storageCode.storageName
            this.name = storageName

          })
          .catch((err) => {
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
.storage{
  border: solid 3px #42b983;
}
</style>