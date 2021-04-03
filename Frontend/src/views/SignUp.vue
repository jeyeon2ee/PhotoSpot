<template>
    <div class="container">
        <form id="form" class="form">
            <h2>Register</h2>
            <div class="form-control" 
                :class="{success : username.validation.success, error : username.validation.error}">
                <label for="username">Username</label>
                <input v-model="username.value" type="text" placeholder="Enter Username">
                <small>{{username.validation.errorMessage}}</small>
            </div>
            <div class="form-control" 
                :class="{success : email.validation.success, error : email.validation.error}">
                <label for="email">Email</label>
                <input v-model="email.value" type="text" placeholder="Enter email">
                <small>{{email.validation.errorMessage}}</small>
            </div>
            <div class="form-control" 
                :class="{success : password.validation.success, error : password.validation.error}">
                <label for="password">Password</label>
                <input v-model="password.value" type="password" placeholder="Enter Password">
                <small>{{password.validation.errorMessage}}</small>
            </div>
            <div class="form-control" 
                :class="{success : confirmedPassword.validation.success, error : confirmedPassword.validation.error}">
                <label for="password2">Confirm Password</label>
                <input v-model="confirmedPassword.value" type="password" placeholder="Enter Password Again">
                <small>{{confirmedPassword.validation.errorMessage}}</small>
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</template>

<script>
export default {
  data() {
    return {
      username : {
        value : '',
        validation : {
          success : false,
          error : false,
          errorMessage : '',
        }
      },
      email : {
        value : '',
        validation : {
          success : false,
          error : false,
          errorMessage : '',
        }
      },
      password : {
        value : '',
        validation : {
          success : false,
          error : false,
          errorMessage : '',
        }
      },
      confirmedPassword : {
        value : '',
        validation : {
          success : false,
          error : false,
          errorMessage : '',
        }
      },
    }
  },

  watch : {
    'username.value' : {
      handler() {
        this.checkLength('username', 6, 20)
      }
    },
    'email.value' : {
      handler() {
        this.checkEmailValidation()
      }
    },
    'password.value' : {
      handler() {
        this.checkLength('password', 6, 20)
        this.checkPasswordMatch()
      }
    },
    'confirmedPassword.value' : {
      handler() {
        this.checkPasswordMatch()
      }
    },
  },

  methods : {
    checkEmailValidation() {
      const regex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

      if(regex.test(this.email.value)) {
          this.showSuccess('email');
      } else {
          this.showError('email', 'Email is not valid');
      }
    },

    checkPasswordMatch() {
      if(this.password.value !== this.confirmedPassword.value) {
        this.showError('confirmedPassword', 'Passwords do not match')
      }
      else {
        this.showSuccess('confirmedPassword')
      }
    },

    checkLength(target, min, max) {
      const length = this[target].value.length

      if(length < min || length > max) {
        this.showError(target, `length of the input must be between ${min} and ${max}`)
      }
      else {
        this.showSuccess(target)
      }
    },

    showSuccess(target) {
      this[target].validation.success = true
      this[target].validation.error = false
    },

    showError(target, message) {
      this[target].validation.errorMessage = message
      this[target].validation.success = false
      this[target].validation.error = true
    },
  },
}
</script>

<style scoped>
:root {
  --success-color: #0dee94;
  --error-color: #f05e70;
}

* {
  box-sizing: border-box;
}

.container {
  font-family: "Raleway";
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
  width: 400px;
}

.form {
  padding: 30px 40px;
}

h2 {
  color :lightslategray;
  text-align: center;
  margin: 0 0 20px;
}

.form-control {
  margin-bottom: 10px;
  padding-bottom: 20px;
  position: relative;
}

.form-control label {
  color: #777;
  display: block;
  margin-bottom: 7px;
}

.form-control input {
  border: 2px solid #f0f0f0;
  border-radius: 4px;
  display: block;
  width: 100%;
  padding: 10px;
  font-size: 15px;
}

.form-control input:focus {
  outline: 0;
  border-color: #777;
}

.form-control.success input {
  border-color: #1cd68c
}

.form-control.error input {
  border-color: #f05e70;
}

.form-control small {
  color: #f05e70;
  position: absolute;
  bottom: 0;
  left: 0;
  visibility: hidden;
}

.form-control.error small {
  visibility: visible;
}

.form button {
  margin: 0 auto;
  cursor: pointer;
  background-color: #7072d4;
  border: 2px solid #7072d4;
  border-radius: 4px;
  color: white;
  display: block;
  font-size: 17px;
  padding: 5px;
  margin-top: 20px;
  width: 30%;
}
</style>>