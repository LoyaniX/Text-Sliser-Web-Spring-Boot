const React = require('react');
const ReactDOM = require('react-dom');

var Employee = React.createClass({

    getInitialState: function() {
        return {display: true };
    },
    render: function() {
        if (this.state.display===false) return null;
        else return (
            <tr>
                <td>{this.props.fileinfo.}</td>
                <td>{this.props.employee.age}</td>
                <td>{this.props.employee.years}</td>
            </tr>
        );
    }
});

var EmployeeTable = React.createClass({

    render: function() {

        var rows = [];
        this.props.employees.forEach(function(employee) {
            rows.push(
                <Employee employee={employee} key={employee.name} />);
        });

        return (
            <table className="table table-striped">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Years</th>
                    <th>Delete</th>
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
           self.setState
       })
   }
});