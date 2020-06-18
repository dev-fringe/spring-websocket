const path = require('path');

module.exports = {
    mode: "production",	
    entry: './src/main/javascript/index.ts',
    module: {rules: [{ 
        test: /\.ts$/, loader: "ts-loader"            
    }]},
    resolve: {
		extensions: [".ts", ".js"]
    },
    output: {
        path: path.resolve(__dirname, 'src/main/webapp/resources'),
        filename: 'index.js'
    }    
};