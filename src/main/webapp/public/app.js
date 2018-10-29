var FileInfo = React.createClass({
    getInitialState: function() {
        return {display: true };
    },

    render: function() {
        if (this.state.display===false) return null;
        else return (
            <tr>
                <td>{this.props.fileInfo.fileName}</td>
                <td>{this.props.fileInfo.longestWord}</td>
                <td>{this.props.fileInfo.lengthOfLongestWord}</td>
                <td>{this.props.fileInfo.shortestWord}</td>
                <td>{this.props.fileInfo.lengthOfShortestWord}</td>
                <td>{this.props.fileInfo.avgLengthWord}</td>
                <td>{this.props.fileInfo.avgLengthLine}</td>
            </tr>
        );
    }
});
var FileInfoTable = React.createClass({

    render: function() {

        var rows = [];
        this.props.fileInfoes.forEach(function(fileInfo) {
            rows.push(
                <FileInfo fileInfo={fileInfo} key={fileInfo.name} />);
        });
        return (
            <table className="table table-striped table-hover">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Longest Word</th>
                    <th>Lenth</th>
                    <th>Shortest Word</th>
                    <th>Length</th>
                    <th>Avg Word</th>
                    <th>Avg Line</th>
                </tr>
                </thead>
                <tbody>{rows}</tbody>
            </table>
        );
    }
});
var App = React.createClass({

   loadFilesInfoFromServer: function () {

       var self = this;
       $.ajax({
           url: "http://localhost:8080/api/fileInfoes"
       }).then(function (data) {
           self.setState({fileInfoes: data._embedded.fileInfoes});
       });
   },

    getInitialState: function() {
        return {fileInfoes: [] };
    },

    componentDidMount: function () {
       this.loadFilesInfoFromServer();
       },

    render(){
       return(<FileInfoTable fileInfoes = {this.state.fileInfoes}/>);
    }
});

ReactDOM.render( <App/>, document.getElementById('root'));