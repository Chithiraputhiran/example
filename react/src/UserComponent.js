import React from 'react';
import UserService from './UserService';

class UserComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Bikes List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>

                            <td> Bike Id</td>
                            <td> Brand</td>
                            <td> Models</td>
                            <td> Varients</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user => 
                                <tr key = {user.id}>
                                     <td> {user.id}</td>   
                                     <td> {user.brand}</td>   
                                     <td> {user.models}</td>   
                                     <td> {user.varient}</td>   
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default UserComponent