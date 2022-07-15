import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import React, { useEffect, useState } from 'react'
import NotificationButton from '../NotificationButton'
import './styles.css'
import axios from "axios";
import { BASE_URL } from "../../utils/request";
import { Sale } from "../../models/sale";

const SalesCard = () => {

    const min = new Date(new Date().setDate(new Date().getDate() - 365));
    const max = new Date();

    const [minDate, setMinDate] = useState(min);
    const [maxDate, setMaxDate] = useState(max);

    const [sales, setSales] = useState<Sale[]>([]); //useState tipado que vai ser uma lista [] vazia

    useEffect(() => { /*Fazendo requisição para o backend */
        axios.get(`${BASE_URL}/sales`) // vai retornar um objeto promisse
            .then(response => {
                setSales(response.data.content);
            })
    }, []) /*Por padrao, por estar rodando em ambiente DEV ele imprimi duas veses*/

    return (
        <div className="card">
            <h2 className="title">Vendas</h2>
            <div >
                <div className="box-control">
                    <DatePicker
                        selected={minDate}
                        onChange={(date: Date) => setMinDate(date)}
                        className="control"
                        dateFormat="dd/MM/yyyy"
                    />
                </div>
                <div className="box-control">
                    <DatePicker
                        selected={maxDate}
                        onChange={(date: Date) => setMaxDate(date)}
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
                        {sales.map(sale => {
                            return (
                                <tr key={sale.id}>
                                    <td className="show960">{sale.id}</td>
                                    <td className="show576">{new Date(sale.date).toLocaleDateString()}</td>
                                    <td>{sale.sellerName}</td>
                                    <td className="show960">{sale.visited}</td>
                                    <td className="show960">{sale.deals}</td>
                                    <td>R$ ${sale.amount.toFixed(2)}</td>
                                    <td>
                                        <div className="btn-container">
                                            <NotificationButton />
                                        </div>
                                    </td>
                                </tr>
                            )
                        })}
                    </tbody>
                </table>
            </div>

        </div>
    )
}

export default SalesCard;