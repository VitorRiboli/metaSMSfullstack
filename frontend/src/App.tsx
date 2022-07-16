import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (
    <> {/*Fragment*/}
      <ToastContainer /> {/*Componente do react toastfy*/}
      <Header />
      <main>
        <section id="sales">
          <div className="container">
              <SalesCard />
          </div>
        </section>
      </main>
    </> /*Fragment*/

  )
}

export default App
