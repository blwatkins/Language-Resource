# Sinatra Routes

require 'sinatra'

# http_method 'url_matching_pattern' do
#    code
# end

# url matching pattern can be a regular expression

get '/' do
    "Hello, World!"
end

get '/about' do
    output = '<h1>About Page</h1>'
    output << '<p>This is the about page</p>'
    output
end

get '/form' do
    'A get request to a form'
end

post '/form' do
    'A post request to a form'
end

# Route Parameters

# unnamed parameter
get '/about/*' do
    subject = params[:splat].first # first item in the params[:splat] array
    "You requested about/#{subject}"
end

# named parameter
get '/company/:subject' do
    subject = params[:subject]
    "You requested company/#{subject}"
end

