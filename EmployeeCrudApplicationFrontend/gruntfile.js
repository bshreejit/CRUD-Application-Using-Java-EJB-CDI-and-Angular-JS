
module.exports = function(grunt){


    grunt.initConfig({
      watch: {
        options: {
            spawn: false,
            livereload: true
        },
        gruntfile: {
            files: ['gruntfile.js'],
            tasks: ['default']
        },
        html: {
            files: [],
        }
    },
      connect: {
        server: {
          options: {
            port: 8000,
            open: {
              target: 'http://localhost:8000'
          },
          livereload: true,
          }
        }
      }
    });

    
    grunt.loadNpmTasks('grunt-contrib-connect');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.registerTask('default', ['connect:server', 'watch']);

};
