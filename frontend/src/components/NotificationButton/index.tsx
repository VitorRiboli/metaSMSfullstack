import React from 'react'
import icon from '../../assets/img/notification-icon.svg'
import "./styles.css"

const NotificationButton = () => {
    return (
        <div className="red-btn">
            <img src={icon} alt="Notificar"/>
        </div>
    )
}

export default NotificationButton