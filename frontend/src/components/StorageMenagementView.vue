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
import StorageManagerView from "@/components/StorageManagerView.vue";
import StorageView from "@/components/StorageView.vue";

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