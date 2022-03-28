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
import StorageManagerView from "@/components/StorageManagerView";
import StorageView from "@/components/StorageView";

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