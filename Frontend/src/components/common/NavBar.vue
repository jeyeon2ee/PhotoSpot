<template>
    <div class="nav-bar">
        <div class="left">
            <div class="img-box">
            <router-link to="/"><img id="logo" alt="Photo Shot logo" src="../../assets/ps.png" /></router-link>
            </div>
        </div>
        <div class="center">
            <div class="blank"/>
            <div class="input-box">
                <input type="text" v-bind:placeholder="message" v-model="location"/>
            </div>
            <div class="img-box">
                <img src="../../assets/search.png" v-on:click="search"/>
            </div>
        </div>
        <div class="right">
            <div class="icon">
                <router-link to="/board"><img src="../../assets/board.png" v-on:click="board"/></router-link>
                <router-link to="/rank"><img src="../../assets/rank.png" v-on:click="rank"/></router-link>
                <router-link to="/login">Login</router-link><br/>
                <router-link to="/signup">Sign Up</router-link>
            </div>
            <div class="profile">
                <img src="../../assets/profile.png" v-on:click="profile"/>
                <p id="username">{{username}}</p>
            </div>
        </div>
    </div>
</template>

<script>

export default{
    data(){
        return{
            message:'Search your Location!',
            username:'',
            location:''
        }
    },
    methods:{
        search(){

        }
    }
}

</script>

<style scoped>
.nav-bar{
    width:95%;
    height:100px;
    background-color: #3c67ff;
    margin-left:2.5%;
    margin-right:2.5%;
    flex-direction: row;
}
.left{
    width:25%;
    height:100%;
    float: left;
    display:table;
}
.center{
    width:50%;
    height:100%;
    float: left;
    display:table;
}
.right{
    width:25%;
    height:100%;
    float: left;
    display:table;
}
.left .img-box{
    display:table-cell;
    vertical-align:middle;
    text-align:center;
}
.left .img-box img{
    width:70%;
}
.center .blank{
    width:10%;
    height:100%;
    display:table-cell;
}
.center .input-box{
    width:80%;
    display:table-cell;
    vertical-align:middle;
    text-align: center;
}
.center .input-box input{
    width:95%;
    height:40px;   
}
.center .img-box{
    width:10%;
    height:100%;
    display:table-cell;
    vertical-align:middle;
}
.center .img-box img{
    width:30px;
    height:30px;
}
.center .img-box img:hover{
    transform:scale(1.05);
}
.right .icon{
    width:80%;
    display:table-cell;
    vertical-align:middle;
    text-align:center;
}
.right .icon img{
    width:15%;
    margin:10px;
    float:left;
}
.right .icon img:hover{
    transform:scale(1.05);
}
.right .profile{
    width:20%;
    display:table-cell;
    vertical-align:middle;
    text-align:center;
}
.right .profile img {
    width:50%;
}
.right .profile #username{
    font-size:5px;
}
</style>