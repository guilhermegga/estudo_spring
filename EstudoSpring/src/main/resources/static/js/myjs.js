new Vue({
            el: '#app',
            data: {
                text: '',
                title: 'To-do List',
                list: [{
                    text: 'Primeira coisa a fazer'
                }]

            },
            methods: {
                addTodo() {
                    this.list.push({
                        text: this.text
                    })
                    this.text = ''
                },
                
                removeTodo(index) {
                    this.list.splice(index, 1)
                },
                
                buscarTodos(){
                		
                	// GET /someUrl
                	  this.$http.get('http://localhost:8080/clientes').then(response => {
                	    document.getElementById("resposta").innerHTML= response;
                	  }, response => {
                		  document.getElementById("resposta").innerHTML= "sem resposta";
                	  });
                }

            }
})