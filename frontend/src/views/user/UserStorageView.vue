<template>
<p>사용자 보관함 보기</p>
  <p>보관소 리스트 페이지</p>
  <div class="storage-get">
    <div v-for="(storage,index) in storageList" :key="index">
      <router-link :to="{name:'detail',params:{storageCode:storage.storageCode}}" @click="detailCheck">
        <div>
          이름:{{ storage.storageName }}
          주소:{{ storage.storageAddress }}
        </div>
      </router-link>
    </div>
  </div>
  <div v-if="check">
    <router-view />
  </div>

</template>

<script>
import axios from "axios";

export default {
  name: "UserStorageView",
  components: {
  },
  created() {
    this.GetStorage()
  },
  data(){
    return{
      storageList:[],
      check : false
    }
  },
  methods:{
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
    },
    detailCheck(){
      this.check = !this.check
    }
  }

}
</script>

<style scoped>

</style>