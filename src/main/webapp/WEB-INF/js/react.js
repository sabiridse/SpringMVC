
function react(){
			ReactDOM.render(<HelWor/>,document.getElementById("test1"));
			ReactDOM.render(<HelllWor/>,document.getElementById("app"));
			testJava();
		
		}
function react1(){

	  ReactDOM.render(<h1>HELLOOOOO</h1>,document.getElemetnById("app"));
	  ReactDOM.render(<But/>,document.getElementById("but1"));
}

	function testJava(){ 
		$.ajax({url:'test1',
	    type:'POST'})
	}
function cons(){
	
	console.log('БЛаблабла');
	
}

function rereact(){
			ReactDOM.render(<HelllWor/>,document.getElementById("test1"));
			//ReactDOM.render(<h1>ByBy</h1>, document.getElemetnById('test1'));
}

function HelWor() {
	return <h1>HELLOOOOO</h1>;
			
}
function HelllWor() {
	return (
		<h1>ByBy</h1>		
	)	
}
function NoBut(){
	<button id="but2" onclick="submit()">NO</button>
}
function But(){
	<button id="but1" onclick="submit()">Submit</button>
}