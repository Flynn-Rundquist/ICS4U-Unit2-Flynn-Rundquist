/**
 * This is the Jet class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2024-04-09
 */

import Airplane from './Airplane'
class Jet extends Airplane {

    // accelerate
    public accelerate(speed: number) {
        this.speed = speed * 2
        return this.speed
    }
}
export default Jet

