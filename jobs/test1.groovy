def gitUrl = 'def gitUrl = 'git://github.com/dbgjerez/ic-m1'

job('test1') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell 'echo "ok1"'
    }
}

job('test2') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell 'echo "ok2"'
    }
}

