<!-- storage admin page(manager)-->
<template>
  <div>

    <div>
      <StorageManagerAdd></StorageManagerAdd>
    </div>

  </div>
</template>

<script>
import StorageManagerAdd from "@/components/StorageManagerAdd.vue";

export default {
  name: "StorageManagerView",
  components:{
    StorageManagerAdd
  }
}
</script>

<style scoped>

</style>