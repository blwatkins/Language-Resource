# GET Requests

require 'sinatra'

get '/' do 
    'Hello, World.'
end

get '/color' do
    # params array holds values of GET parameters as symbols
    # sample URL = http://localhost:4567/color?red=255&green=45&blue=55
    red = params[:red]
    green = params[:green]
    blue = params[:blue]
    "color = color(#{red}, #{green}, #{blue})"
end
