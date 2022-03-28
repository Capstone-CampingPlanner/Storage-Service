<!-- storage admin page(storage)-->
<template>
  <div class="storage-view-main">
    <div class="storage-get">
      <div v-for="(storage,index) in storageList" :key="index">
        이름:{{storage.storage_name}}
      </div>
    </div>
    <div class="input-storage">
      <StorageAdd></StorageAdd> <!-- 라우터를 이용해서 따로 빼야함-->
    </div>
    <div>
      <StorageRevise></StorageRevise>
    </div>
  </div>
</template>

<script>
import StorageAdd from "@/components/StorageAdd.vue";
import StorageRevise from "@/components/StorageRevise.vue";
import axios from "axios";

export default {
  name: "StorageView",
  components: {
    StorageAdd,
    StorageRevise
  },
  mounted() {
    this.GetStorages()
  },
  data(){
    return{
      count: [],
      inputs:{
        storage_name:'',
        storage_zipcode:'',
        storage_address:''
      },
      storageList:[]
    }
  },
  methods:{
    GetStorages(){
      axios.get('/api/getStorages')
          .then((res)=>{
            console.log(res)
            this.count = res.data.list
            for(var i = 0 ; i < count.length;i++){
              this.inputs.storage_name = this.count[i].storage_name
              this.inputs.storage_zipcode = this.count[i].storage_zipcode
              this.inputs.storage_address = this.count[i].storage_address
              this.storageList.push(this.inputs)
              this.ClearInputs()
            }
          })
          .catch((error)=>{
            console.log(error)
          })
    },
    ClearInputs(){
      this.inputs.storage_name=''
      this.inputs.storage_zipcode=''
      this.inputs.storage_address=''

    }
  }
}
</script>

<style scoped>

</style>