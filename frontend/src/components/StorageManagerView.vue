<!-- storage admin page(manager)-->
<template>
  <div>

    <div>
      <StorageManagerAdd></StorageManagerAdd>
    </div>
    <div class="manager-get">
      <div v-for="(manager, index) in storageManagerList" :key="index">
        보관소:{{manager.storageName}},
        매니저이름:{{manager.storageManagerName}},
        매니저아이디:{{manager.storageManagerId}}
      </div>
    </div>
  </div>
</template>

<script>
import StorageManagerAdd from "@/components/StorageManagerAdd.vue";
import axios from "axios";

export default {
  name: "StorageManagerView",
  components:{
    StorageManagerAdd
  },
  data(){
    return{
      count: [],
      inputs:{
        storageManagerName:'',
        storageManagerId:'',
        storageName:''
      },
      storageManagerList:[]
    }
  },
  mounted() {
    this.GetStorageManager()
  },
  methods:{
    GetStorageManager() {
      axios.get('/api/getStorageManger')
          .then((res) => {
            console.log(res)
            this.count = res.data
            for (var i; i , count.length; i++) {
              this.inputs.storageManagerName = this.count[i].storageManagerName
              this.inputs.storageManagerId = this.count[i].storageManagerName
              this.inputs.storageName = this.count[i].storageName
              this.storageManagerList.push(this.inputs)
              this.ClearInputs()
            }
          })
    },
    ClearInputs(){
      this.inputs.storageManagerName=''
      this.inputs.storageManagerId=''
      this.inputs.storageName=''
    }
  }
}
</script>

<style scoped>

</style>