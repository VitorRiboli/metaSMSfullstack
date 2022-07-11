import React from 'react'
import './styles.css'
import header from "../../assets/img/header.svg"

const Header = () => {
    return (
        <header>
            <div className="header">
                <img src={header} alt="" />
                <h1>META SMS</h1>
                <p>Desenvolvido por <a href="https://github.com/VitorRiboli"> Vitor Riboli</a></p>
            </div>
        </header>
    )
}

export default Header