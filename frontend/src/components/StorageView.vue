<!-- storage admin page(storage)-->
<template>
  <div class="storage-view-main">
    <div class="storage-get">
<<<<<<< HEAD
      <div v-for="(storage,index) in storageList" :key="index">
=======
      <div v-for="(storage,index) in storageList">
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
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
<<<<<<< HEAD
import StorageAdd from "@/components/StorageAdd.vue";
import StorageRevise from "@/components/StorageRevise.vue";
=======
import StorageAdd from "@/components/StorageAdd";
import StorageRevise from "@/components/StorageRevise";
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
import axios from "axios";

export default {
  name: "StorageView",
  components: {
    StorageAdd,
    StorageRevise
  },
<<<<<<< HEAD
=======

>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
  mounted() {
    this.GetStorages()
  },
  data(){
    return{
<<<<<<< HEAD
      count: [],
=======
      account: [],
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
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
<<<<<<< HEAD
            this.count = res.data.list
            for(var i = 0 ; i < count.length;i++){
              this.inputs.storage_name = this.count[i].storage_name
              this.inputs.storage_zipcode = this.count[i].storage_zipcode
              this.inputs.storage_address = this.count[i].storage_address
=======
            this.account = res.data.list
            for(var i = 0 ; i < account.length;i++){
              this.inputs.storage_name = this.account[i].storage_name
              this.inputs.storage_zipcode = this.account[i].storage_zipcode
              this.inputs.storage_address = this.account[i].storage_address
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
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