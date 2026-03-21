package chipyard.config

import chipyard._
import org.chipsalliance.cde.config.{Parameters, Config}

class WithAXI4DigitalTop extends Config((site, here, up) => {
  case BuildSystem => (p: Parameters) => new AXI4DigitalTop()(p)
})
