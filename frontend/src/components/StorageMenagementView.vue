<!-- storage admin page-->
<template>
  <div class="storage-management">
    <div class="storage-manager">
      <StorageManagerView></StorageManagerView>
    </div>
  </div>
</template>

<script>
import StorageManagerView from "@/components/StorageManagerView.vue";

export default {
  name: "StorageManagementView",
  components:{
    StorageManagerView
  }
}
</script>

<style scoped>

</style>