import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import React from 'react'
import NotificationButton from '../NotificationButton'
import './styles.css'

const SalesCard = () => {
    return (
        <div className="card">
            <h2 className="title">Vendas</h2>
            <div >
                <div className="box-control">
                    <DatePicker
                        selected={new Date()}
                        onChange={(date: Date) => { }}
                        className="control"
                        dateFormat="dd/MM/yyyy"
                    />
                </div>
                <div className="box-control">
                    <DatePicker
                        selected={new Date()}
                        onChange={(date: Date) => { }}
                        className="control"
                        dateFormat="dd/MM/yyyy"
                    />
                </div>
            </div>

            <div>
                <table className="sales-table">
                    <thead>
                        <tr>
                            <th className="show960">ID</th>
                            <th className="show576">Data</th>
                            <th>Vendedor</th>
                            <th className="show960">Visitas</th>
                            <th className="show960">Vendas</th>
                            <th>Total</th>
                            <th>Notificar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td className="show960">#1</td>
                            <td className="show576">08/07/2022</td>
                            <td>Anakin</td>
                            <td className="show960">10</td>
                            <td className="show960">10</td>
                            <td>R$ 55300.00</td>
                            <td>
                                <div className="btn-container">
                                    <NotificationButton />
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td className="show960">#1</td>
                            <td className="show576">08/07/2022</td>
                            <td>Anakin</td>
                            <td className="show960">10</td>
                            <td className="show960">10</td>
                            <td>R$ 55300.00</td>
                            <td>
                                <div className="btn-container">
                                    <NotificationButton />
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td className="show960">#1</td>
                            <td className="show576">08/07/2022</td>
                            <td>Anakin</td>
                            <td className="show960">10</td>
                            <td className="show960">10</td>
                            <td>R$ 55300.00</td>
                            <td>
                                <div className="btn-container">
                                    <NotificationButton />
                                </div>
                            </td>
                        </tr>

                    </tbody>


                </table>
            </div>

        </div>
    )
}

export default SalesCard