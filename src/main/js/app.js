const React = require('react');
const ReactDOM = require('react-dom');


class App extends React.Component {

	constructor(props) {
		super(props);
		//this.state = {employees: []};
	}

	render() {
		return (
				<h1>Hello, React!</h1>
		)
	}
}


ReactDOM.render(
		<App />,
		document.getElementById('react')
	)