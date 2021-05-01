<template>
    <div>
        <NavBar :username="username"/>
        <PhotoCarousel :images="images"/>
    </div>
</template>

<script>
    import NavBar from "../components/common/NavBar.vue"
    import PhotoCarousel from  "../components/common/PhotoCarousel.vue"
    
    export default{
        components : {
            NavBar,
            PhotoCarousel
        },
        data() {
            return {
                images:[
                    "http://speeker.co.kr/wp-content/uploads/2018/11/%EC%9D%B8%EC%8A%A4%ED%83%80-%EC%82%AC%EC%9D%B4%EC%A6%88-%EC%A0%95%EB%B0%A9%ED%96%A527-1-770x770.jpg",
                    "https://t1.daumcdn.net/cfile/tistory/99305D435D67C2710F",
                    "https://t1.daumcdn.net/cfile/tistory/99C8C0365D656B8E01",
                    "https://pbs.twimg.com/media/Evid9j5XEAIrpAH?format=jpg&name=900x900",
                    "https://data.whicdn.com/images/345726794/original.jpg"
                ],
                username:"heejeong"
            }
        },
    }
</script>

<style>

</style>