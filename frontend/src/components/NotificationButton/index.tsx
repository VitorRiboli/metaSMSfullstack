import axios from 'axios';
import React from 'react'
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';
import "./styles.css"

type Props = { //Criando um tipo (Prop)
    saleId: number; //esse tipo pode ter um ou mais atributos
}

function handleClick(id : number) { //tipando o id como number
    axios.get(`${BASE_URL}/sales/${id}/notification`)
        .then(res => { 
            toast.info("SMS enviado com sucesso");
        });
}


                        //Coloca os dados que precisar : Props, vai ser o tipo que criou
const NotificationButton = ( {saleId} : Props ) => {
    return (
        <div className="red-btn" onClick={() => handleClick(saleId)}> {/*Botao que quando executado roda a função handleClick com o parametro saleId */}
            <img src={icon} alt="Notificar"/>
        </div>
    )
}

export default NotificationButton
