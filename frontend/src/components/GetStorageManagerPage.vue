<template>
  <p>리스트 컴포넌트</p>
  <div class="manager-get">
    <div v-for="(manager, index) in storageManagerList" :key="index">
      보관소:{{ manager.storageCode.storageName }},
      매니저이름:{{ manager.memberCode.memberName }},
      매니저아이디:{{ manager.memberCode.memberId }}
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "GetStorageManagerPage",
    data(){
      return {
        storageManagerList: []
      }
    },
    mounted(){
      this.GetStorageManager()
    },
    methods:{
      GetStorageManager()
      {
        axios.get('/api/getStorageManger')
            .then((res) => {
              console.log(res)
              this.storageManagerList = res.data

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