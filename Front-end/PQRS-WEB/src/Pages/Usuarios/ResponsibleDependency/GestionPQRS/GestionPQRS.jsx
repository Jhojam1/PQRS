import { Link } from 'react-router-dom';
import './VerPQRS.css';
import { MenuSecre } from '../../../../../componentes/Menu';
import { BackGraund } from '../../../../../componentes/BackGraund';

export const GestionPQRS = () => {
    return (
        <div className='VerPQRS'>
            <BackGraund/>
            <MenuSecre/>
                <div className="gestion">
                    <p>
                    Proximamente
                    </p>

                </div>
            </div>

    );
};



