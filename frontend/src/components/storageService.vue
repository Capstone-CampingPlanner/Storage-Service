<template>
    <form @submit.prevent="addStorage">
      <h2>보관함 추가</h2>
      <label for="sName">보관소 이름:</label>
      <input id="sName" v-model="sName">
      <label for="zipCode">우편번호:</label>
      <input id="zipCode" v-model="zipCode">
      <label for="sAddress">주소 :</label>
      <input id="sAddress" v-model="sAddress">
      <input type="button" value="Submit">
    </form>

</template>


<script>
import axios from "axios";

export default {
  name: "storageService",
  components: {},
  data() {
    return {
      sName: '',
      zipCode: '',
      sAddress: ''
    }
  },
  methods: {

    addStorage() {
      let productStorage = {
        sName: this.sName,
        zipCode: this.zipCode,
        sAddress: this.sAddress
      }
      console.log(productStorage)
      axios.post('/api/addStrg', this.addStorage())

    }

  }


}
</script>

<style scoped>

</style>