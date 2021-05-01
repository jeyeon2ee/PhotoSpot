<template>
  <button class="button" @click="showTestModal = true">모달창 띄우기</button>
  <button class="button" @click="showSignUpModal = true">회원가입</button>

  <Modal :show="showSignUpModal" @close="showSignUpModal=false">
    <template v-slot:header>
      <h2>회원가입</h2>
    </template>

    <template v-slot:content>
      <SignUp/>
    </template>
  </Modal>

  <Modal :show="showTestModal" @close="showTestModal=false">
    <template v-slot:header>
      <h3>이것은 모달의 제목</h3>
    </template>

    <template v-slot:content>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur, ratione eligendi! Quae fuga perspiciatis quibusdam quod dolore velit voluptatem, minima facilis ad iste numquam harum minus quis consequatur sapiente laudantium.</p>
    </template>

    <template v-slot:footer-right>
        <button>우측하단</button>
    </template>
    <template v-slot:footer-center>
        <button>중앙하단</button>
    </template>
    <template v-slot:footer-left>
        <button>좌측하단</button>
    </template>
  </Modal>
</template>

<script>
import Modal from '../components/common/Modal.vue'
import SignUp from '../components/signup/SignUp.vue'

export default {
  components : {
      Modal,
      SignUp,
  },
  data() {
    return {
      showTestModal : false,
      showSignUpModal : false,
    }
  },
  methods : {
  }  
}
</script>

<style scoped>
.button {
    width : 100px;
    height : 100px;
}
</style>