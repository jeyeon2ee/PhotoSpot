<template>
    <div class="carousel-section">
        <div class="left-section">
            <div class="img-box"><img v-bind:src="l_img_src"/></div>
        </div>
        <div class="center-section">
            <div class="b-box">
                <img src="../../assets/left-arrow.png" @click="next"/>
            </div>
            <div class="img-box">
                <img v-bind:src="c_img_src"/>
            </div>
            <div class="b-box">
                <img src="../../assets/right-arrow.png" @click="next"/>
            </div>
        </div>
        <div class="right-section">
            <div class="img-box"><img v-bind:src="r_img_src"/></div>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            images : Array
        },
        data: function(){
            return { 
                currentNumber:0,
            };
        },
        computed: {
            l_img_src: function(){
                var prevNumber = this.currentNumber-1
                if(prevNumber < 0)
                    prevNumber = this.images.length-1;
                return this.images[prevNumber]
            },
            c_img_src : function(){
                return this.images[this.currentNumber]
            },
            r_img_src :function(){
               var nextNumber = (this.currentNumber+1)%5
               return this.images[nextNumber]
            } 
        },
        methods: {
            prev(){
                var prevNumber = this.currentNumber-1
                if(prevNumber < 0)
                    prevNumber = this.images.length-1;
                this.currentNumber = prevNumber
            },
            next(){
                var nextNumber = (this.currentNumber+1)%5
                this.currentNumber = nextNumber
            }
        }
    }
</script>

<style scoped>
.carousel-section{
    width:80%;
    height:600px;
    margin-top:5px;
    margin-left:10%;
    margin-right:10%;
    flex-direction: column;
}
.left-section{
    width:20%;
    height:100%;
    float:left;
    display:table;
}
.left-section .img-box{
    display:table-cell;
    vertical-align:middle;
    overflow:hidden;
}
.left-section .img-box img{
    width:120%;
    float:right;
    margin-right:10%;
}
.right-section{
    width:20%;
    height:100%;
    float:left;
    display:table;
}
.right-section .img-box{
    display:table-cell;
    vertical-align:middle;
    overflow:hidden;
}
.right-section .img-box img{
    width:120%;
    float:left;
    margin-left:10%;
}
.center-section{
    width:60%;
    height:100%;
    float:left;
    display:table;
}
.center-section .b-box{
    width: 5%;
    height: 100%;
    display:table-cell;
    vertical-align:middle;
    text-align: center;
}
.center-section .b-box img{
    width:100%;
}
.center-section .img-box{
    width: 90%;
    height: 100%;
    /* position: relative;
    overflow: hidden; */
    display:table-cell;
    vertical-align:middle;
    text-align: center;
}
.center-section .img-box img{
    object-fit:fill;
    width:90%;
}

</style>