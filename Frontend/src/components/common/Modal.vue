<template>
    <transition name="fade" :class="{shake : animated}">
        <div v-if="showModal" @click="closeModal" class="modal-container" id="modal-container">
            <div @click.stop class="modal">
                <div class="modal-close">
                    <font-awesome-icon @click="closeModal" class="close-icon" icon="times"/>
                </div>
                <div v-if="hasHeader" class="modal-header">
                    <slot name="header"/>
                </div>
                <div class="modal-content">
                    <slot name="content"/>
                </div>
                <div v-if="hasFooter" class="modal-footer">
                    <div class="footer-left"><slot name="footer-left"></slot></div>
                    <div class="footer-center"><slot name="footer-center"></slot></div>
                    <div class="footer-right"><slot name="footer-right"></slot></div>
                </div>
            </div>
        </div>    
    </transition>
</template>

<script>
export default {
    name : "Modal",
    props : {
        show : {
            type : Boolean,
            default : false,
        },
        forceManualClose : {
            type : Boolean,
            default : false,
        },
    },
    data() {
        return {
            showModal : false,
            animated : false,
        }
    },
    watch : {
        show(newVal, oldVal) {
            this.showModal = newVal
        },
        
    },
    computed : {
        hasHeader() {
            return !!this.$slots['header']
        },
        hasFooter() {
            return !!this.$slots['footer-left'] || !!this.$slots['footer-center'] || !!this.$slots['footer-right']
        }
    },
    methods : {
        closeModal(evt) {
            if(this.forceManualClose && evt.target.id == 'modal-container') {
                this.animated = true
                setTimeout(()=> this.animated = false, 500)
                return
            }

            this.showModal = false
            this.$emit("close")
        }
    }
}
</script>

<style scoped>
* {
    /* border : 1px solid;  */
    box-sizing: border-box;
}

.modal-container {
    display : flex;
    justify-content: center;
    align-items: center;
    position : fixed;
    top : 0;
    left : 0;
    right : 0;
    bottom : 0;
    background-color: rgba(0, 0, 0, 0.1);
}

.modal {
    display: flex;
    flex-direction: column;
    justify-content: center;
    /* width : 400px; */
    max-width: 800px;
    background-color: white;
    border-radius: 5px;
    padding: 5px;
    box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
}

.modal-close {
    position: relative;
    text-align: right;
    padding-right: 7px;
    padding-top: 5px;
}

.close-icon {
    position: relative;
    top : 0;
    right : 0;
}

.close-icon:hover {
    cursor: pointer;
}

.modal-header{
    text-align: center;
    margin-top : 0;
}

.modal-content {
    padding : 20px
}

.modal-footer {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    padding : 10px
}

.fade-enter-active {
    transition : opacity 0.5s ease;
}

.fade-enter-from {
    opacity: 0;
}

.shake {
    animation: shake 0.3s
}

@keyframes shake {
    0% {
        transform: scale(1);
    }

    50% {
        transform: scale(1.05);
    }

    100% {
        transform: scale(1);
    }
}
</style>