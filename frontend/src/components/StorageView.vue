<!-- storage admin page(storage)-->
<template>
  <div class="storage-view-main">
    <p>여기에서 get, input, detail, revise 들이 페이지 전환</p>
    <div class="storage-get">
      <GetStoragePage></GetStoragePage>
    </div>
  </div>
</template>

<script>

import StorageAdd from "@/components/StorageAdd.vue";
import StorageRevise from "@/components/StorageRevise.vue";
import GetStoragePage from "@/components/GetStoragePage";

export default {
  name: "StorageView",
  components: {
    StorageAdd,
    StorageRevise,
    GetStoragePage
  }
}
</script>

<style scoped>

</style>