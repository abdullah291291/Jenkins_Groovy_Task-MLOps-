def deploy(String branch_name) {
  if (branch_name == "PROD") {
    println "Deploying to Production."
  } 
  else if (branch_name == "TEST") {
    println "Deploying to Test."
  }
  else {
    println "Deploying to Dev."
  }
}

def build() {
  println "Building..."
  bat '"C:\\Users\\abdul\\AppData\\Local\\Programs\\Python\\Python311\\Scripts\\pip.exe" install -r requirements.txt'
}

def test() {
  println "Testing..."
  bat '"C:\\Users\\abdul\\AppData\\Local\\Programs\\Python\\Python311\\python.exe" test.py'
}


return this
