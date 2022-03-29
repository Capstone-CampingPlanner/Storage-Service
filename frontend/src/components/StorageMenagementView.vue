<!-- storage admin page-->
<template>
  <div class="storage-management">
    <div class="storage-manager">
      <StorageManagerView></StorageManagerView>
    </div>
    <div class="storege-view">
      <StorageView></StorageView>
    </div>

  </div>
</template>

<script>
<<<<<<< HEAD
import StorageManagerView from "@/components/StorageManagerView.vue";
import StorageView from "@/components/StorageView.vue";
=======
import StorageManagerView from "@/components/StorageManagerView";
import StorageView from "@/components/StorageView";
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

export default {
  name: "StorageManagementView",
  components:{
    StorageManagerView,
    StorageView
  }
}
</script>

<style scoped>

</style>