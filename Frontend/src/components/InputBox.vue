<template>
<div class="loginBox">
    <div class="loginInfo">
        <input type="text" v-bind:placeholder="messageID" v-model="userID"/>
    </div>
    <div class="loginInfo">
        <input type="text" v-bind:placeholder="messagePW" v-model="userPW"/>
    </div>
    <div class="submitArea">
        <button v-on:click="login">Login</button>
    </div>
    <p>{{userID}}</p>
    <p>{{userPW}}</p>
</div>
</template>

<script>
export default {
    setup () {
        

        return {}
    },
    name:"Input",
    data(){
        return{
            messageID:"ID",
            messagePW:"Password",
            userID:'',
            userPW:''
        }
    },
    methods:{
        login : function(){
            const userId = this.userID;
            const userPW = this.userPW;

            // this.$store.dispatch('LOGIN', {userId, passWd});
        }
    },
}
</script>

<style scoped>
.loginBox{
    color:black;
    display:block;
    width:500px;
    height:300px;
    flex-direction:row;
    padding-left:50px;
    padding-top: 50px;
}
.loginInfo{
    color:black;
    display:block;
    width:400px;
    height:70px;
    flex-direction:row;
}
input[type="text"]{
    width:380px;
    height:60px;
    border: 1px solid;
    box-shadow: 2px;
    padding: 10px;
}
.submitArea{
    color:black;
    display:block;
    width:400px;
    height:60px;
}
.submitArea button{
    text-align:center;
    width:380px;
    height:50px;
    border-radius: 5px;
    color : white;
    background-color:#006ACB;
}

</style>