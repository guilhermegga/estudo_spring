new Vue({
            el: '#app',
            data: {
            	
                text: '',
                title: 'To-do List',
                list: [{
                    text: 'to-do zuado'
                }],
                clientes:[]

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
                		
                	// busca dados do banco 
                	  this.$http.get('http://localhost:8080/clientes').then(response => {
                		  //se der certo
                		this.clientes = response.body;
                		
                	  }, response => {
                		  //se der errado
                		  document.getElementById("resposta").innerHTML= "sem resposta";
                	  });
                }

            }
})