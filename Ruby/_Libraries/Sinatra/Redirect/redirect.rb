# Redirecting

# can redirect to a separate webpage/URL

require 'sinatra'

get '/' do
    'Hello, world!'
end

get '/hello' do
    'Hello there!'
end

get '/welcome' do
    redirect('/hello')
end
