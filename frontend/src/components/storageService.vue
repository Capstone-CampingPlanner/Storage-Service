<template>
  <form @submit.prevent="addStorage">
    <h2>보관함 추가</h2>
    <label for="sName">보관소 이름:</label>
    <input id="sName" v-model="sName">
    <label for="zipCode">우편번호:</label>
    <input id="zipCode" v-model="zipCode">
    <label for="sAddress">주소 :</label>
    <input id="sAddress" v-model="sAddress">
    <input type="button" type="submit" value="Submit">
  </form>

  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="https://unpkg.com/vue@next"></script>
</template>

<script>
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
    clearAll() {
      this.sName
    :
      '',
          this.zipCode
    :
      '',
          this.sAddress
    :
      ''
    },
    addStorage() {
      let productStorage = {
        sName: this.sName,
        zipCode: this.zipCode,
        sAddress: this.sAddress
      }
      console.log(productStorage)
      axios.post('/api/addStrg', this.addStorage())
          .done((response) => {
            if (response.result == 'ok') {
              alert('등록되었습니다.');
              window.location.href = '/addmenu'
              console.log(1);
            } else {
              alert('등록되지 않았습니다.');
              console.log(2);

            }
          })
          .fail((response) => {
            alert('(에러)등록되지 않았습니다.');
            console.log(3);

          });
      this.clearAll();
    }

  }

}
</script>

<style scoped>

</style>