<template>
  <p>보관소 리스트 페이지</p>
  <div class="storage-get">
    <div v-for="(storage,index) in storageList" :key="index">
      <router-link :to="{name:'',params:{storageCode:storage.storageCode}}">
        이름:{{ storage.storageName }}
        주소:{{ storage.storageAddress }}
      </router-link>
    </div>
    <router-link :to="{name:'storageAdd'}">추가하기</router-link>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "GetStoragePage",
  mounted() {
    this.GetStorages()
  },
  data() {
    return {
      storageList: []
    }
  },
  methods: {
    GetStorages() {
      axios.get('/api/getStorages')
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
    }
  }
}
</script>

<style scoped>

</style>