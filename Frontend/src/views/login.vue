<template>
    <div class="full">
        <div class="left">
            <div class="title">
                <p id="wt">Welcome to</p>
                <p id="ps">PHOTOSPOT</p>
            </div>
            <div class="description">
                <p>Enjoy new life style in PHOTOSPOT<br/>
                    abcdefghijklmnopqrstuvwxyz<br/>
                    I’m hungry and so tired. Sooo sleepy<br/>
                    </p>
            </div>
        </div>
        <div class="right">
            <img id="logo" alt="Photo Shot logo" src="../assets/PhotoShot.png" />
            <InputBox/>
        </div>
    </div>
</template>

<script setup>
    import InputBox from '../components/InputBox.vue'
</script>

<style scoped>
.full{
    width:1000px;
    height:600px;
    display: flex;
    border-radius: 20px;
    box-shadow: 5px 5px 20px;
    margin-left: 220px;
}
.left{
    width:500px;
    height:600px;
    background-color:#006ACB;
    border-top-left-radius: 20px;
    border-bottom-left-radius: 20px;
}
.right{
    width:500px;
    height:600px;
    border-top-right-radius: 20px;
    border-bottom-right-radius: 20px;
}
img[id="logo"] {
    margin-left:60px;
    margin-top:50px;
}
.title {
    width:380px;
    height:150px;
    margin-top:200px;
    margin-left:60px;
    text-align: left;
    color:white;
}
.title p[id="wt"]{
    margin:10px;
    font-size: 30px;
}
.title p[id="ps"]{
    margin:10px;
    font-size: 40px;
    font-weight : bold;
}
.description{
    width:380px;
    height:150px;
    margin-left:60px;
    margin-top:30px;
    text-align: left;
    font-size: 20px;
    color:white;
    font-weight : bold;
    padding:10px;
}
</style>