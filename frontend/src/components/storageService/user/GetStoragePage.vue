<template>
  <p>보관소 리스트 페이지</p>
  <div class="storage-get">
    <div v-for="(storage,index) in storageList" :key="index">
      <router-link :to="{name:'detail',params:{storageCode:storage.storageCode}}">
        <div>
          이름:{{ storage.storageName }}
          주소:{{ storage.storageAddress }}
        </div>
      </router-link>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "GetStoragePage",
  mounted() {
    this.GetStorage()
  },
  data() {
    return {
      storageList: []
    }
  },
  methods: {
    GetStorage() {
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
    }
  }
}
</script>

<style scoped>

</style>